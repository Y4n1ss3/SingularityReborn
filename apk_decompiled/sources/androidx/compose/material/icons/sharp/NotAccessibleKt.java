package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotAccessibleKt {
    private static ImageVector _notAccessible;

    public static final ImageVector getNotAccessible(Icons.Sharp sharp) {
        ImageVector imageVector = _notAccessible;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NotAccessible", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveTo(10.9f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(10.0f, 20.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.curveToRelative(0.0f, -1.31f, 0.84f, -2.41f, 2.0f, -2.83f);
        b.verticalLineTo(12.1f);
        b.curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f);
        b.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        b.curveToRelative(2.42f, 0.0f, 4.44f, -1.72f, 4.9f, -4.0f);
        b.horizontalLineToRelative(-2.07f);
        b.curveTo(12.42f, 19.16f, 11.31f, 20.0f, 10.0f, 20.0f);
        k4.r(b, 21.19f, 21.19f, 2.81f, 2.81f);
        b.lineTo(1.39f, 4.22f);
        fc.t(b, 10.0f, 12.83f, 17.0f, 4.17f);
        gy.B(b, 5.61f, 5.61f, 21.19f, 21.19f);
        b.moveTo(19.0f, 11.0f);
        b.curveToRelative(-1.54f, 0.02f, -3.09f, -0.75f, -4.07f, -1.83f);
        b.lineToRelative(-1.29f, -1.43f);
        b.curveTo(13.4f, 7.5f, 13.2f, 7.38f, 13.01f, 7.28f);
        b.curveToRelative(-0.36f, -0.19f, -0.72f, -0.3f, -1.2f, -0.26f);
        b.curveToRelative(-0.49f, 0.04f, -0.91f, 0.27f, -1.23f, 0.61f);
        b.lineTo(14.0f, 11.05f);
        b.curveToRelative(1.29f, 1.07f, 3.25f, 1.94f, 5.0f, 1.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notAccessible = build;
        build.getClass();
        return build;
    }
}
