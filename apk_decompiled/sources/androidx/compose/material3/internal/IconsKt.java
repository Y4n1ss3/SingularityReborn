package androidx.compose.material3.internal;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IconsKt {
    private static final float MaterialIconDimension = 24.0f;

    private static final ImageVector materialIcon(String str, ky kyVar) {
        return ((ImageVector.Builder) kyVar.invoke(new ImageVector.Builder(str, Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null))).build();
    }

    public static /* synthetic */ ImageVector materialIcon$default(String str, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ((ImageVector.Builder) kyVar.invoke(new ImageVector.Builder(str, Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z, 96, null))).build();
    }

    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    private static final ImageVector.Builder m2900materialPathYwgOQQI(ImageVector.Builder builder, float f, float f2, int i, ky kyVar) {
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        kyVar.invoke(pathBuilder);
        return ImageVector.Builder.m5492addPathoIyEayM$default(builder, pathBuilder.getNodes(), i, "", solidColor, f, null, f2, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m2901materialPathYwgOQQI$default(ImageVector.Builder builder, float f, float f2, int i, ky kyVar, int i2, Object obj) {
        float f3 = (i2 & 1) != 0 ? 1.0f : f;
        float f4 = (i2 & 2) != 0 ? 1.0f : f2;
        int defaultFillType = (i2 & 4) != 0 ? VectorKt.getDefaultFillType() : i;
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        kyVar.invoke(pathBuilder);
        return ImageVector.Builder.m5492addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, f3, null, f4, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    private static final ImageVector materialIcon(String str, boolean z, ky kyVar) {
        return ((ImageVector.Builder) kyVar.invoke(new ImageVector.Builder(str, Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z, 96, null))).build();
    }
}
