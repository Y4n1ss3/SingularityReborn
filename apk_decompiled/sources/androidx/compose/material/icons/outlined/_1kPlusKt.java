package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _1kPlusKt {
    private static ImageVector __1kPlus;

    public static final ImageVector get_1kPlus(Icons.Outlined outlined) {
        ImageVector imageVector = __1kPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined._1kPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        af0.r(d, 19.0f, 11.5f, -1.5f, 10.0f);
        af0.z(d, -1.0f, 1.5f, 15.0f, 1.0f);
        af0.q(d, 1.5f, 14.0f, 1.0f, -1.5f);
        af0.y(d, 19.0f, 19.0f, 5.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 14.0f, 11.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(7.5f, 15.0f, 1.5f, 0.0f);
        e.lineToRelative(0.0f, -6.0f);
        e.lineToRelative(-3.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, 1.5f, 1.5f, 0.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(12.0f, 12.75f, 1.75f, 2.25f);
        e2.lineToRelative(1.75f, 0.0f);
        e2.lineToRelative(-2.25f, -3.0f);
        e2.lineToRelative(2.25f, -3.0f);
        e2.lineToRelative(-1.75f, 0.0f);
        e2.lineToRelative(-1.75f, 2.25f);
        e2.lineToRelative(0.0f, -2.25f);
        e2.lineToRelative(-1.5f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 0.0f, 6.0f, 1.5f, 0.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __1kPlus = build;
        build.getClass();
        return build;
    }
}
