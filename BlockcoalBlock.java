package net.minecraft.src;
import java.util.Random;
        
  public class BlockcoalBlock extends Block
  { 
    public BlockcoalBlock(int par1, int par2)
    {
        super(par1, par2, Material.rock);
    }    

    public int idDropped(int i, Random random)
    {
      return Item.coal.shiftedIndex;
    }

    public int quantityDropped(Random random)
    {
      return 9;
    }
}