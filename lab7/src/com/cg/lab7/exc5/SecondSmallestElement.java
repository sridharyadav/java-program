package com.cg.lab7.exc5;

import java.util.Arrays;

public class SecondSmallestElement 
{
  public int getSecondSmallestElement(int arr[])
  {
	  Arrays.sort(arr);
	  return arr[1];
  }
}