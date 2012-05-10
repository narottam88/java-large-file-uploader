package com.am.jlfu.fileuploader.json;


public class FileStateJson
		extends FileStateJsonBase {

	private static final long serialVersionUID = 5043865795253104456L;

	/** Specifies whether the file is complete or not. */
	private boolean fileComplete;

	/** Bytes which have been completed. */
	private Long fileCompletionInBytes;

	/** The CRC of the first chunk */
	private String firstChunkCrc;



	/**
	 * Default constructor.
	 */
	public FileStateJson() {
		super();
	}


	public Boolean getFileComplete() {
		return fileComplete;
	}


	public void setFileComplete(Boolean fileComplete) {
		this.fileComplete = fileComplete;
	}


	public Long getFileCompletionInBytes() {
		return fileCompletionInBytes;
	}


	public void setFileCompletionInBytes(Long fileCompletionInBytes) {
		this.fileCompletionInBytes = fileCompletionInBytes;
	}


	public String getFirstChunkCrc() {
		return firstChunkCrc;
	}


	public void setFirstChunkCrc(String firstChunkCrc) {
		this.firstChunkCrc = firstChunkCrc;
	}


}
