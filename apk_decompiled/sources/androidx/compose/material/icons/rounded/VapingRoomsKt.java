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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VapingRoomsKt {
    private static ImageVector _vapingRooms;

    public static final ImageVector getVapingRooms(Icons.Rounded rounded) {
        ImageVector imageVector = _vapingRooms;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VapingRooms", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 17.5f);
        b.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        af0.u(b, 8.0f, -3.0f, 12.5f);
        b.curveTo(21.33f, 16.0f, 22.0f, 16.67f, 22.0f, 17.5f);
        b.close();
        b.moveTo(10.5f, 17.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveTo(10.78f, 17.0f, 10.5f, 17.0f);
        b.close();
        b.moveTo(18.85f, 7.73f);
        b.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        b.curveToRelative(0.0f, -1.51f, -1.0f, -2.79f, -2.38f, -3.21f);
        b.curveTo(16.99f, 2.0f, 16.5f, 2.36f, 16.5f, 2.86f);
        b.curveToRelative(0.0f, 0.33f, 0.21f, 0.62f, 0.52f, 0.71f);
        b.curveToRelative(0.77f, 0.23f, 1.33f, 0.94f, 1.33f, 1.78f);
        b.curveToRelative(0.0f, 0.82f, -0.53f, 1.51f, -1.27f, 1.76f);
        b.curveTo(16.75f, 7.22f, 16.5f, 7.5f, 16.5f, 7.85f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f);
        b.curveToRelative(1.93f, 0.31f, 3.36f, 2.0f, 3.36f, 4.02f);
        b.verticalLineToRelative(1.48f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveTo(22.0f, 14.66f, 22.0f, 14.25f);
        b.verticalLineToRelative(-1.49f);
        b.curveTo(22.0f, 10.54f, 20.72f, 8.62f, 18.85f, 7.73f);
        b.close();
        b.moveTo(18.76f, 15.0f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f);
        b.verticalLineToRelative(-0.89f);
        b.curveToRelative(-0.01f, -1.81f, -1.61f, -3.16f, -3.48f, -3.16f);
        b.horizontalLineToRelative(-1.3f);
        b.curveToRelative(-1.02f, 0.0f, -1.94f, -0.73f, -2.07f, -1.75f);
        b.curveToRelative(-0.12f, -0.95f, 0.46f, -1.7f, 1.3f, -1.93f);
        b.curveToRelative(0.32f, -0.09f, 0.54f, -0.38f, 0.54f, -0.72f);
        b.curveToRelative(0.0f, -0.49f, -0.46f, -0.86f, -0.93f, -0.72f);
        b.curveToRelative(-1.42f, 0.41f, -2.45f, 1.73f, -2.42f, 3.28f);
        b.curveToRelative(0.03f, 1.84f, 1.62f, 3.29f, 3.46f, 3.29f);
        b.horizontalLineToRelative(1.42f);
        b.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        b.verticalLineToRelative(0.55f);
        b.curveTo(18.0f, 14.66f, 18.34f, 15.0f, 18.76f, 15.0f);
        b.close();
        b.moveTo(3.0f, 18.5f);
        b.curveToRelative(1.33f, 0.0f, 2.71f, 0.18f, 4.0f, 0.5f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(-1.29f, 0.32f, -2.67f, 0.5f, -4.0f, 0.5f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 2.45f, 18.5f, 3.0f, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vapingRooms = build;
        build.getClass();
        return build;
    }
}
