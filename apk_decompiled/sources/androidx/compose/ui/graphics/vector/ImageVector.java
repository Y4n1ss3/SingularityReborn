package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.dq;
import defpackage.er;
import defpackage.j50;
import defpackage.kp0;
import defpackage.q10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageVector {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int imageVectorCount;
    private static final Object lock;
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final int genId;
    private final String name;
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        lock = companion;
    }

    public /* synthetic */ ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z, int i2, int i3, dq dqVar) {
        this(str, f, f2, f3, f4, vectorGroup, j, i, z, (i3 & Fields.RotationY) != 0 ? Companion.generateImageVectorId$ui() : i2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return q10.b(this.name, imageVector.name) && Dp.m7616equalsimpl0(this.defaultWidth, imageVector.defaultWidth) && Dp.m7616equalsimpl0(this.defaultHeight, imageVector.defaultHeight) && this.viewportWidth == imageVector.viewportWidth && this.viewportHeight == imageVector.viewportHeight && q10.b(this.root, imageVector.root) && Color.m4762equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m4670equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m5488getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m5489getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    public final int getGenId$ui() {
        return this.genId;
    }

    public final String getName() {
        return this.name;
    }

    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m5490getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m5491getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return Boolean.hashCode(this.autoMirror) + ((BlendMode.m4671hashCodeimpl(this.tintBlendMode) + kp0.d(this.tintColor, (this.root.hashCode() + bv.a(this.viewportHeight, bv.a(this.viewportWidth, j50.a(this.defaultHeight, j50.a(this.defaultWidth, this.name.hashCode() * 31, 31), 31), 31), 31)) * 31, 31)) * 31);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final int generateImageVectorId$ui() {
            int i;
            synchronized (ImageVector.lock) {
                i = ImageVector.imageVectorCount;
                ImageVector.imageVectorCount = i + 1;
            }
            return i;
        }

        private Companion() {
        }
    }

    private ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z, int i2) {
        this.name = str;
        this.defaultWidth = f;
        this.defaultHeight = f2;
        this.viewportWidth = f3;
        this.viewportHeight = f4;
        this.root = vectorGroup;
        this.tintColor = j;
        this.tintBlendMode = i;
        this.autoMirror = z;
        this.genId = i2;
    }

    public /* synthetic */ ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z, int i2, dq dqVar) {
        this(str, f, f2, f3, f4, vectorGroup, j, i, z, i2);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        private final String name;
        private final ArrayList<GroupParams> nodes;
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        private Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.name = str;
            this.defaultWidth = f;
            this.defaultHeight = f2;
            this.viewportWidth = f3;
            this.viewportHeight = f4;
            this.tintColor = j;
            this.tintBlendMode = i;
            this.autoMirror = z;
            ArrayList<GroupParams> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            ImageVectorKt.push(arrayList, groupParams);
        }

        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            if ((i & 4) != 0) {
                f2 = 0.0f;
            }
            if ((i & 8) != 0) {
                f3 = 0.0f;
            }
            if ((i & 16) != 0) {
                f4 = 1.0f;
            }
            if ((i & 32) != 0) {
                f5 = 1.0f;
            }
            if ((i & 64) != 0) {
                f6 = 0.0f;
            }
            if ((i & Fields.SpotShadowColor) != 0) {
                f7 = 0.0f;
            }
            if ((i & Fields.RotationX) != 0) {
                list = VectorKt.getEmptyPath();
            }
            float f8 = f7;
            List list2 = list;
            float f9 = f6;
            float f10 = f4;
            return builder.addGroup(str, f, f2, f3, f10, f5, f9, f8, list2);
        }

        /* renamed from: addPath-oIyEayM$default, reason: not valid java name */
        public static /* synthetic */ Builder m5492addPathoIyEayM$default(Builder builder, List list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, Object obj) {
            return builder.m5493addPathoIyEayM(list, (i4 & 2) != 0 ? VectorKt.getDefaultFillType() : i, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? null : brush, (i4 & 16) != 0 ? 1.0f : f, (i4 & 32) == 0 ? brush2 : null, (i4 & 64) != 0 ? 1.0f : f2, (i4 & Fields.SpotShadowColor) != 0 ? 0.0f : f3, (i4 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2, (i4 & Fields.RotationY) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3, (i4 & Fields.RotationZ) != 0 ? 4.0f : f4, (i4 & Fields.CameraDistance) != 0 ? 0.0f : f5, (i4 & Fields.TransformOrigin) == 0 ? f6 : 1.0f, (i4 & 8192) != 0 ? 0.0f : f7);
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        private final void ensureNotConsumed() {
            if (this.isConsumed) {
                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final GroupParams getCurrentGroup() {
            Object peek;
            peek = ImageVectorKt.peek(this.nodes);
            return (GroupParams) peek;
        }

        public final Builder addGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list) {
            ensureNotConsumed();
            ImageVectorKt.push(this.nodes, new GroupParams(str, f, f2, f3, f4, f5, f6, f7, list, null, Fields.RotationY, null));
            return this;
        }

        /* renamed from: addPath-oIyEayM, reason: not valid java name */
        public final Builder m5493addPathoIyEayM(List<? extends PathNode> list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(str, list, i, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7, null));
            return this;
        }

        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, Fields.RotationY, null);
            this.isConsumed = true;
            return imageVector;
        }

        public final Builder clearGroup() {
            Object pop;
            ensureNotConsumed();
            pop = ImageVectorKt.pop(this.nodes);
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) pop));
            return this;
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, dq dqVar) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        @er
        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, dq dqVar) {
            this(str, f, f2, f3, f4, j, i);
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, dq dqVar) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? BlendMode.Companion.m4699getSrcIn0nO6VwU() : i, (i2 & Fields.SpotShadowColor) != 0 ? false : z, (dq) null);
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, int i2, dq dqVar) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? BlendMode.Companion.m4699getSrcIn0nO6VwU() : i, (dq) null);
        }

        private Builder(String str, float f, float f2, float f3, float f4, long j, int i) {
            this(str, f, f2, f3, f4, j, i, false, (dq) null);
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class GroupParams {
            private List<VectorNode> children;
            private List<? extends PathNode> clipPathData;
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public /* synthetic */ GroupParams(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, dq dqVar) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) != 0 ? 1.0f : f5, (i & 64) != 0 ? 0.0f : f6, (i & Fields.SpotShadowColor) != 0 ? 0.0f : f7, (i & Fields.RotationX) != 0 ? VectorKt.getEmptyPath() : list, (i & Fields.RotationY) != 0 ? new ArrayList() : list2);
            }

            public final List<VectorNode> getChildren() {
                return this.children;
            }

            public final List<PathNode> getClipPathData() {
                return this.clipPathData;
            }

            public final String getName() {
                return this.name;
            }

            public final float getPivotX() {
                return this.pivotX;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(List<VectorNode> list) {
                this.children = list;
            }

            public final void setClipPathData(List<? extends PathNode> list) {
                this.clipPathData = list;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final void setPivotX(float f) {
                this.pivotX = f;
            }

            public final void setPivotY(float f) {
                this.pivotY = f;
            }

            public final void setRotate(float f) {
                this.rotate = f;
            }

            public final void setScaleX(float f) {
                this.scaleX = f;
            }

            public final void setScaleY(float f) {
                this.scaleY = f;
            }

            public final void setTranslationX(float f) {
                this.translationX = f;
            }

            public final void setTranslationY(float f) {
                this.translationY = f;
            }

            public GroupParams(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, List<VectorNode> list2) {
                this.name = str;
                this.rotate = f;
                this.pivotX = f2;
                this.pivotY = f3;
                this.scaleX = f4;
                this.scaleY = f5;
                this.translationX = f6;
                this.translationY = f7;
                this.clipPathData = list;
                this.children = list2;
            }

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }
        }
    }
}
