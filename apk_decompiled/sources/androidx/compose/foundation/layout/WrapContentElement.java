package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.kp0;
import defpackage.mb;
import defpackage.my;
import defpackage.nb;
import defpackage.q10;
import defpackage.w5;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {
    public static final Companion Companion = new Companion(null);
    private final Object align;
    private final my alignmentCallback;
    private final Direction direction;
    private final String inspectorName;
    private final boolean unbounded;

    public WrapContentElement(Direction direction, boolean z, my myVar, Object obj, String str) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = myVar;
        this.align = obj;
        this.inspectorName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public WrapContentNode create() {
        return new WrapContentNode(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && q10.b(this.align, wrapContentElement.align);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.align.hashCode() + kp0.c(this.direction.hashCode() * 31, 31, this.unbounded);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("align", this.align);
        inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(this.unbounded));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(WrapContentNode wrapContentNode) {
        wrapContentNode.setDirection(this.direction);
        wrapContentNode.setUnbounded(this.unbounded);
        wrapContentNode.setAlignmentCallback(this.alignmentCallback);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset height$lambda$0(Alignment.Vertical vertical, IntSize intSize, LayoutDirection layoutDirection) {
            return IntOffset.m7730boximpl(IntOffset.m7733constructorimpl(vertical.align(0, (int) (intSize.m7786unboximpl() & 4294967295L)) & 4294967295L));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset size$lambda$0(Alignment alignment, IntSize intSize, LayoutDirection layoutDirection) {
            return IntOffset.m7730boximpl(alignment.mo4178alignKFBX0sM(IntSize.Companion.m7787getZeroYbymL2g(), intSize.m7786unboximpl(), layoutDirection));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset width$lambda$0(Alignment.Horizontal horizontal, IntSize intSize, LayoutDirection layoutDirection) {
            return IntOffset.m7730boximpl(IntOffset.m7733constructorimpl(horizontal.align(0, (int) (intSize.m7786unboximpl() >> 32), layoutDirection) << 32));
        }

        public final WrapContentElement height(Alignment.Vertical vertical, boolean z) {
            return new WrapContentElement(Direction.Vertical, z, new nb(vertical, 3), vertical, "wrapContentHeight");
        }

        public final WrapContentElement size(Alignment alignment, boolean z) {
            return new WrapContentElement(Direction.Both, z, new w5(alignment, 18), alignment, "wrapContentSize");
        }

        public final WrapContentElement width(Alignment.Horizontal horizontal, boolean z) {
            return new WrapContentElement(Direction.Horizontal, z, new mb(horizontal, 4), horizontal, "wrapContentWidth");
        }

        private Companion() {
        }
    }
}
