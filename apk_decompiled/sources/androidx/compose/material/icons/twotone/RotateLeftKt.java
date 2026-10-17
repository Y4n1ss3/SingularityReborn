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
import defpackage.af0;
import defpackage.er;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RotateLeftKt {
    private static ImageVector _rotateLeft;

    public static final ImageVector getRotateLeft(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rotateLeft;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RotateLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(13.0f, 17.91f, 2.02f);
        h.curveToRelative(3.95f, -0.49f, 7.0f, -3.85f, 7.0f, -7.93f);
        h.reflectiveCurveToRelative(-3.05f, -7.44f, -7.0f, -7.93f);
        h.lineTo(13.0f, 1.0f);
        h.lineTo(8.45f, 5.55f);
        h.lineTo(13.0f, 10.0f);
        h.lineTo(13.0f, 6.09f);
        h.curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f);
        h.reflectiveCurveToRelative(-2.16f, 5.43f, -5.0f, 5.91f);
        k4.x(h, 5.69f, 16.89f, 1.41f, -1.42f);
        h.curveToRelative(-0.52f, -0.75f, -0.87f, -1.59f, -1.01f, -2.47f);
        h.lineTo(4.07f, 13.0f);
        h.curveToRelative(0.17f, 1.39f, 0.72f, 2.73f, 1.62f, 3.89f);
        k4.r(h, 7.11f, 8.53f, 5.7f, 7.11f);
        h.curveTo(4.8f, 8.27f, 4.24f, 9.61f, 4.07f, 11.0f);
        h.horizontalLineToRelative(2.02f);
        h.curveToRelative(0.14f, -0.87f, 0.49f, -1.72f, 1.02f, -2.47f);
        h.close();
        h.moveTo(11.0f, 17.9f);
        h.curveToRelative(-0.87f, -0.15f, -1.71f, -0.49f, -2.46f, -1.03f);
        h.lineTo(7.1f, 18.32f);
        h.curveToRelative(1.16f, 0.9f, 2.51f, 1.44f, 3.9f, 1.61f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(h, 11.0f, 17.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateLeft = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getRotateLeft$annotations(Icons.TwoTone twoTone) {
    }
}
