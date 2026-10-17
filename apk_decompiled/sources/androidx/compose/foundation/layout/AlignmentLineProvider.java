package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import defpackage.dq;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class AlignmentLineProvider {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Block extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final ky lineProviderBlock;

        public Block(ky kyVar) {
            super(null);
            this.lineProviderBlock = kyVar;
        }

        public static /* synthetic */ Block copy$default(Block block, ky kyVar, int i, Object obj) {
            if ((i & 1) != 0) {
                kyVar = block.lineProviderBlock;
            }
            return block.copy(kyVar);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return ((Number) this.lineProviderBlock.invoke(placeable)).intValue();
        }

        public final ky component1() {
            return this.lineProviderBlock;
        }

        public final Block copy(ky kyVar) {
            return new Block(kyVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Block) && q10.b(this.lineProviderBlock, ((Block) obj).lineProviderBlock);
        }

        public final ky getLineProviderBlock() {
            return this.lineProviderBlock;
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Value extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final AlignmentLine alignmentLine;

        public Value(AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        public static /* synthetic */ Value copy$default(Value value, AlignmentLine alignmentLine, int i, Object obj) {
            if ((i & 1) != 0) {
                alignmentLine = value.alignmentLine;
            }
            return value.copy(alignmentLine);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return placeable.get(this.alignmentLine);
        }

        public final AlignmentLine component1() {
            return this.alignmentLine;
        }

        public final Value copy(AlignmentLine alignmentLine) {
            return new Value(alignmentLine);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && q10.b(this.alignmentLine, ((Value) obj).alignmentLine);
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }
    }

    public /* synthetic */ AlignmentLineProvider(dq dqVar) {
        this();
    }

    public abstract int calculateAlignmentLinePosition(Placeable placeable);

    private AlignmentLineProvider() {
    }
}
