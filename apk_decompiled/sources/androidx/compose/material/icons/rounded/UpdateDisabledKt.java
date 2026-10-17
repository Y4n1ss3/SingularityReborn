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
import defpackage.bv;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UpdateDisabledKt {
    private static ImageVector _updateDisabled;

    public static final ImageVector getUpdateDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _updateDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.UpdateDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.49f, 20.49f, 3.51f, 3.51f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(2.31f, 2.31f);
        i.curveTo(3.57f, 8.56f, 3.05f, 10.09f, 3.0f, 11.74f);
        i.curveTo(2.86f, 16.83f, 6.94f, 21.0f, 12.0f, 21.0f);
        i.curveToRelative(1.76f, 0.0f, 3.39f, -0.52f, 4.78f, -1.39f);
        i.lineToRelative(2.29f, 2.29f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        i.close();
        i.moveTo(10.72f, 18.89f);
        i.curveToRelative(-2.78f, -0.49f, -5.04f, -2.71f, -5.58f, -5.47f);
        i.curveToRelative(-0.34f, -1.72f, -0.03f, -3.36f, 0.72f, -4.73f);
        i.lineToRelative(9.46f, 9.46f);
        i.curveTo(13.98f, 18.87f, 12.4f, 19.18f, 10.72f, 18.89f);
        bv.v(i, 13.0f, 8.0f, 2.17f);
        i.lineToRelative(-2.0f, -2.0f);
        i.verticalLineTo(8.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveTo(13.0f, 7.45f, 13.0f, 8.0f);
        i.close();
        i.moveTo(20.72f, 14.23f);
        i.curveToRelative(-0.23f, 0.92f, -0.61f, 1.77f, -1.1f, 2.55f);
        i.lineToRelative(-1.47f, -1.47f);
        i.curveToRelative(0.27f, -0.5f, 0.49f, -1.03f, 0.63f, -1.59f);
        i.curveTo(18.89f, 13.3f, 19.29f, 13.0f, 19.73f, 13.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(20.38f, 13.0f, 20.88f, 13.61f, 20.72f, 14.23f);
        i.close();
        i.moveTo(7.24f, 4.41f);
        i.curveToRelative(1.46f, -0.93f, 3.18f, -1.45f, 5.0f, -1.41f);
        i.curveToRelative(2.65f, 0.07f, 5.0f, 1.28f, 6.6f, 3.16f);
        i.lineToRelative(1.31f, -1.31f);
        i.curveTo(20.46f, 4.54f, 21.0f, 4.76f, 21.0f, 5.21f);
        i.verticalLineTo(9.5f);
        i.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        i.horizontalLineToRelative(-4.29f);
        i.curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.35f, -0.85f);
        i.lineToRelative(1.55f, -1.55f);
        i.curveTo(16.12f, 6.02f, 14.18f, 5.0f, 12.0f, 5.0f);
        i.curveToRelative(-1.2f, 0.0f, -2.33f, 0.31f, -3.32f, 0.85f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 7.24f, 4.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _updateDisabled = build;
        build.getClass();
        return build;
    }
}
