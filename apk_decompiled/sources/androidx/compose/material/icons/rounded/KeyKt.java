package androidx.compose.material.icons.rounded;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyKt {
    private static ImageVector _key;

    public static final ImageVector getKey(Icons.Rounded rounded) {
        ImageVector imageVector = _key;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Key", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(20.59f, 10.0f, -7.94f);
        a.curveTo(11.7f, 7.31f, 8.89f, 5.5f, 5.77f, 6.12f);
        a.curveToRelative(-2.29f, 0.46f, -4.15f, 2.3f, -4.63f, 4.58f);
        a.curveTo(0.32f, 14.58f, 3.26f, 18.0f, 7.0f, 18.0f);
        a.curveToRelative(2.61f, 0.0f, 4.83f, -1.67f, 5.65f, -4.0f);
        a.horizontalLineTo(13.0f);
        a.lineToRelative(1.29f, 1.29f);
        a.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        a.lineTo(17.0f, 14.0f);
        a.lineToRelative(1.29f, 1.29f);
        a.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        a.lineToRelative(2.59f, -2.61f);
        a.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f);
        a.lineToRelative(-0.99f, -0.97f);
        a.curveTo(21.1f, 10.1f, 20.85f, 10.0f, 20.59f, 10.0f);
        a.close();
        a.moveTo(7.0f, 15.0f);
        a.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        a.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        a.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        a.curveTo(10.0f, 13.65f, 8.65f, 15.0f, 7.0f, 15.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _key = build;
        build.getClass();
        return build;
    }
}
