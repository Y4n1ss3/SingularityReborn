package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _360Kt {
    private static ImageVector __360;

    public static final ImageVector get_360(Icons.TwoTone twoTone) {
        ImageVector imageVector = __360;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone._360", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = bv.i(9.0f, 16.77f, 20.0f, 4.0f, -4.0f);
        i.lineToRelative(-4.0f, -4.0f);
        i.verticalLineToRelative(2.73f);
        i.curveToRelative(-3.15f, -0.56f, -5.0f, -1.9f, -5.0f, -2.73f);
        i.curveToRelative(0.0f, -1.06f, 3.04f, -3.0f, 8.0f, -3.0f);
        i.reflectiveCurveToRelative(8.0f, 1.94f, 8.0f, 3.0f);
        i.curveToRelative(0.0f, 0.73f, -1.46f, 1.89f, -4.0f, 2.53f);
        i.verticalLineToRelative(2.05f);
        i.curveToRelative(3.53f, -0.77f, 6.0f, -2.53f, 6.0f, -4.58f);
        i.curveToRelative(0.0f, -2.76f, -4.48f, -5.0f, -10.0f, -5.0f);
        i.reflectiveCurveTo(2.0f, 9.24f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, 2.24f, 2.94f, 4.13f, 7.0f, 4.77f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __360 = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void get_360$annotations(Icons.TwoTone twoTone) {
    }
}
