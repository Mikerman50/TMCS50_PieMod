package net.minecraft.src;
import java.util.Random;

public class mod_PieMod extends BaseMod
{  
  
  //Declare coalBlock
  public static Block m_coalBlock = new coalBlock(701, 0)
    .setHardness(2F).setResistance(10F)
    .setLightValue(0.0F).setBlockName("m_coalBlock");  
  
  //Declare Dough
  public static final Item m_Dough = new Dough(700)
    .setItemName("m_Dough"); 
  
  //Declare piecase
  public static final Item m_piecase = new piecase(702)
    .setItemName("m_piecase"); 
  
  public String getVersion()
  {
    return "PieMod 1.0.0";
  }  
  public void load() {  }
    
  public mod_PieMod()
  {     
    ModLoader.registerBlock(m_coalBlock); //coalBlock 

    //Add Tooltips
      //Blocks       
    ModLoader.addName(m_coalBlock, "Block of Coal"); //coalBlock 
     //Items
    ModLoader.addName(m_Dough, "Dough Ball"); //Dough
    ModLoader.addName(m_piecase, "Pastry Case"); //piecase
     //Armor Sets
     //ToolSets

    //Textures
     //Blocks  
    m_coalBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/PieMod/images/coalblock.png");
     //Items
    m_Dough.iconIndex = ModLoader.addOverride("/gui/items.png", "/PieMod/images/dough.png");
    m_piecase.iconIndex = ModLoader.addOverride("/gui/items.png", "/PieMod/images/piecase");
     //ToolSets

    //Recipes
     //coalBlock Recipe    
     ModLoader.addRecipe(new ItemStack(m_coalBlock, 1), new Object []{"CCC" , "CCC" , "CCC" ,
       Character.valueOf('C'), Item.Item.Coal
    });
     //piecase Recipe    
     ModLoader.addRecipe(new ItemStack(m_piecase, 1), new Object []{"   " , "D D" , "DDD" ,
       Character.valueOf('D'), m_Block.Dough
     });

    //Furnace Recipes
  }

  public void GenerateSurface(World worldMod, Random rand, int i, int j)
  {
  }
}
