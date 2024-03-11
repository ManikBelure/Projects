package com.icici;

public class InsufficienentBalanceException extends RuntimeException 
{
  private String message;
  
  public InsufficienentBalanceException(String message)
  {
	  this.message=message;
  }
  
  public String getMessage()
  {
	  return message;
  }
}
