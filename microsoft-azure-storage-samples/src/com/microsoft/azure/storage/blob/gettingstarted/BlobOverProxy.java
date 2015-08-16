package com.microsoft.azure.storage;

import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.util.UUID;

import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.blob.BlobContainerPermissions;
import com.microsoft.azure.storage.blob.BlobContainerPublicAccessType;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import com.microsoft.azure.storage.blob.CloudBlockBlob;
import com.microsoft.azure.storage.blob.ListBlobItem;

public class BlobOverProxy {
	/**
	 * Executes the sample.
	 * 
	 * @param args
	 *            No input args are expected from users.
	 * @throws URISyntaxException
	 * @throws InvalidKeyException
	 */
	public static void main(String[] args)  {
		URI uri = new URI("http://account.blob.core.windows.net"); 
		StorageCredentials credentials = new StorageCredentialsAccountAndKey("account", "xyz==")
		Proxy httpProxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress("squid.address.com",3128))
		CloudBlobClient blobClient = new CloudBlobClient(uri,credentials,httpProxy);
		Iterable<CloudBlobContainer> containers = blobClient.listContainers();
		for (CloudBlobContainer cloudBlobContainer : containers) {
			System.out.println(cloudBlobContainer.getName());
		}
	}
}
