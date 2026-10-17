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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StrollerKt {
    private static ImageVector _stroller;

    public static final ImageVector getStroller(Icons.Rounded rounded) {
        ImageVector imageVector = _stroller;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Stroller", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(18.0f, 18.9f, 18.0f, 20.0f);
        b.close();
        b.moveTo(6.0f, 18.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f);
        b.close();
        b.moveTo(14.3f, 4.1f);
        b.curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f);
        b.curveTo(8.49f, 3.0f, 7.07f, 3.38f, 5.83f, 4.03f);
        b.curveTo(5.24f, 4.34f, 5.15f, 5.15f, 5.61f, 5.61f);
        gy.B(b, 3.99f, 3.99f, 14.3f, 4.1f);
        b.moveTo(21.94f, 5.83f);
        b.curveTo(21.65f, 4.22f, 20.3f, 3.0f, 18.65f, 3.0f);
        b.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        b.lineTo(6.71f, 15.31f);
        b.curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f);
        b.horizontalLineTo(15.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineTo(6.27f);
        b.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        b.curveToRelative(0.68f, 0.0f, 1.22f, 0.52f, 1.33f, 1.21f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(20.08f, 6.66f, 20.48f, 7.0f, 20.96f, 7.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.curveTo(21.96f, 5.94f, 21.95f, 5.89f, 21.94f, 5.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 21.94f, 5.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stroller = build;
        build.getClass();
        return build;
    }
}
