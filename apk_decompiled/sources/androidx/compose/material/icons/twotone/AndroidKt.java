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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidKt {
    private static ImageVector _android;

    public static final ImageVector getAndroid(Icons.TwoTone twoTone) {
        ImageVector imageVector = _android;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Android", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.6f, 9.48f, 1.84f, -3.18f);
        e.curveToRelative(0.16f, -0.31f, 0.04f, -0.69f, -0.26f, -0.85f);
        e.curveToRelative(-0.29f, -0.15f, -0.65f, -0.06f, -0.83f, 0.22f);
        e.lineToRelative(-1.88f, 3.24f);
        e.curveToRelative(-2.86f, -1.21f, -6.08f, -1.21f, -8.94f, 0.0f);
        e.lineTo(5.65f, 5.67f);
        e.curveToRelative(-0.19f, -0.29f, -0.58f, -0.38f, -0.87f, -0.2f);
        e.curveTo(4.5f, 5.65f, 4.41f, 6.01f, 4.56f, 6.3f);
        e.lineTo(6.4f, 9.48f);
        e.curveTo(3.3f, 11.25f, 1.28f, 14.44f, 1.0f, 18.0f);
        e.horizontalLineToRelative(22.0f);
        e.curveTo(22.72f, 14.44f, 20.7f, 11.25f, 17.6f, 9.48f);
        e.close();
        e.moveTo(7.0f, 15.25f);
        e.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        e.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        e.reflectiveCurveTo(8.25f, 13.31f, 8.25f, 14.0f);
        e.curveTo(8.25f, 14.69f, 7.69f, 15.25f, 7.0f, 15.25f);
        e.close();
        e.moveTo(17.0f, 15.25f);
        e.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        e.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        e.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        e.curveTo(18.25f, 14.69f, 17.69f, 15.25f, 17.0f, 15.25f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _android = build;
        build.getClass();
        return build;
    }
}
