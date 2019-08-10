package slimeknights.tconstruct.world.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.Tree;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.PlantType;
import slimeknights.tconstruct.world.TinkerWorld;

import javax.annotation.Nonnull;

public class SlimeSaplingBlock extends SaplingBlock {

  public SlimeSaplingBlock(Tree tree) {
    super(tree, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT));
  }

  @Override
  protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
    Block block = state.getBlock();
    return block == TinkerWorld.green_slime_dirt || block == TinkerWorld.blue_slime_dirt || block == TinkerWorld.purple_slime_dirt || block == TinkerWorld.magma_slime_dirt || block == TinkerWorld.blue_vanilla_slime_grass || block == TinkerWorld.purple_vanilla_slime_grass || block == TinkerWorld.orange_vanilla_slime_grass || block == TinkerWorld.blue_green_slime_grass || block == TinkerWorld.purple_green_slime_grass || block == TinkerWorld.orange_green_slime_grass || block == TinkerWorld.blue_blue_slime_grass || block == TinkerWorld.purple_blue_slime_grass || block == TinkerWorld.orange_blue_slime_grass || block == TinkerWorld.blue_purple_slime_grass || block == TinkerWorld.purple_purple_slime_grass || block == TinkerWorld.orange_purple_slime_grass || block == TinkerWorld.blue_magma_slime_grass || block == TinkerWorld.purple_magma_slime_grass || block == TinkerWorld.orange_magma_slime_grass;
  }

  @Nonnull
  @Override
  public PlantType getPlantType(IBlockReader world, BlockPos pos) {
    return TinkerWorld.slimePlantType;
  }

  @Override
  @Deprecated
  public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
    return false;
  }
}
