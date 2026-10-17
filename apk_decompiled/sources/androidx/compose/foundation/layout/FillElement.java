package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FillElement extends ModifierNodeElement<FillNode> {
    public static final Companion Companion = new Companion(null);
    private final Direction direction;
    private final float fraction;
    private final String inspectorName;

    public FillElement(Direction direction, float f, String str) {
        this.direction = direction;
        this.fraction = f;
        this.inspectorName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FillNode create() {
        return new FillNode(this.direction, this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.direction == fillElement.direction && this.fraction == fillElement.fraction;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.fraction) + (this.direction.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.fraction));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FillNode fillNode) {
        fillNode.setDirection(this.direction);
        fillNode.setFraction(this.fraction);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final FillElement height(float f) {
            return new FillElement(Direction.Vertical, f, "fillMaxHeight");
        }

        public final FillElement size(float f) {
            return new FillElement(Direction.Both, f, "fillMaxSize");
        }

        public final FillElement width(float f) {
            return new FillElement(Direction.Horizontal, f, "fillMaxWidth");
        }

        private Companion() {
        }
    }
}
