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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HotelClassKt {
    private static ImageVector _hotelClass;

    public static final ImageVector getHotelClass(Icons.Rounded rounded) {
        ImageVector imageVector = _hotelClass;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HotelClass", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(8.58f, 10.0f, 2.56f);
        d.curveToRelative(-0.49f, 0.0f, -0.69f, 0.62f, -0.29f, 0.91f);
        d.lineToRelative(4.91f, 3.51f);
        d.lineToRelative(-1.89f, 6.1f);
        d.curveToRelative(-0.14f, 0.46f, 0.39f, 0.84f, 0.78f, 0.55f);
        d.lineTo(11.0f, 17.31f);
        d.lineToRelative(4.93f, 3.75f);
        d.curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f);
        d.lineToRelative(-1.89f, -6.1f);
        d.lineToRelative(4.91f, -3.51f);
        d.curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f);
        d.horizontalLineToRelative(-6.02f);
        d.lineToRelative(-1.95f, -6.42f);
        d.curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f);
        uo.l(d, 8.58f, 10.0f, 20.9f, 20.51f);
        d.lineToRelative(-1.4f, -4.52f);
        d.lineToRelative(2.91f, -2.08f);
        d.curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f);
        d.horizontalLineToRelative(-1.88f);
        d.lineToRelative(-3.08f, 2.2f);
        d.lineToRelative(1.46f, 4.72f);
        d.lineToRelative(1.5f, 1.14f);
        d.curveTo(20.51f, 21.35f, 21.04f, 20.97f, 20.9f, 20.51f);
        k4.x(d, 17.0f, 8.0f, -1.34f, -4.42f);
        d.curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f);
        d.lineToRelative(-0.57f, 1.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(d, 14.91f, 8.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hotelClass = build;
        build.getClass();
        return build;
    }
}
