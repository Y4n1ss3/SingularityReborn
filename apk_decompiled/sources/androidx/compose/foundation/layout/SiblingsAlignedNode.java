package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class SiblingsAlignedNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = Modifier.Node.$stable;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class WithAlignmentLineBlockNode extends SiblingsAlignedNode {
        public static final int $stable = 8;
        private ky block;

        public WithAlignmentLineBlockNode(ky kyVar) {
            super(null);
            this.block = kyVar;
        }

        public final ky getBlock() {
            return this.block;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.ui.node.ParentDataModifierNode
        public Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout(new AlignmentLineProvider.Block(this.block)));
            return rowColumnParentData;
        }

        public final void setBlock(ky kyVar) {
            this.block = kyVar;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class WithAlignmentLineNode extends SiblingsAlignedNode {
        public static final int $stable = 8;
        private AlignmentLine alignmentLine;

        public WithAlignmentLineNode(AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.ui.node.ParentDataModifierNode
        public Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout(new AlignmentLineProvider.Value(this.alignmentLine)));
            return rowColumnParentData;
        }

        public final void setAlignmentLine(AlignmentLine alignmentLine) {
            this.alignmentLine = alignmentLine;
        }
    }

    public /* synthetic */ SiblingsAlignedNode(dq dqVar) {
        this();
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public abstract Object modifyParentData(Density density, Object obj);

    private SiblingsAlignedNode() {
    }
}
