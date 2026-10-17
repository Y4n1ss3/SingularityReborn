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
import defpackage.af0;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoomPreferencesKt {
    private static ImageVector _roomPreferences;

    public static final ImageVector getRoomPreferences(Icons.Sharp sharp) {
        ImageVector imageVector = _roomPreferences;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RoomPreferences", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(14.0f, 11.26f, 6.0f, 3.0f, 4.0f);
        af0.n(c, 2.0f, 4.0f, -5.0f, 3.0f);
        af0.o(c, 5.0f, 16.0f, 3.0f, 2.0f);
        c.horizontalLineToRelative(9.26f);
        c.curveTo(11.47f, 19.87f, 11.0f, 18.49f, 11.0f, 17.0f);
        c.curveTo(11.0f, 14.62f, 12.19f, 12.53f, 14.0f, 11.26f);
        r6.B(c, 10.0f, 11.0f, 2.0f, 2.0f);
        uo.r(c, -2.0f, 11.0f, 21.69f, 16.37f);
        c.lineToRelative(1.14f, -1.0f);
        c.lineToRelative(-1.0f, -1.73f);
        c.lineToRelative(-1.45f, 0.49f);
        c.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        c.lineTo(19.0f, 12.0f);
        c.horizontalLineToRelative(-2.0f);
        c.lineToRelative(-0.3f, 1.49f);
        c.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        c.lineToRelative(-1.45f, -0.49f);
        c.lineToRelative(-1.0f, 1.73f);
        c.lineToRelative(1.14f, 1.0f);
        c.curveToRelative(-0.08f, 0.5f, -0.08f, 0.76f, 0.0f, 1.26f);
        c.lineToRelative(-1.14f, 1.0f);
        c.lineToRelative(1.0f, 1.73f);
        c.lineToRelative(1.45f, -0.49f);
        c.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        c.lineTo(17.0f, 22.0f);
        c.horizontalLineToRelative(2.0f);
        c.lineToRelative(0.3f, -1.49f);
        c.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        c.lineToRelative(1.45f, 0.49f);
        c.lineToRelative(1.0f, -1.73f);
        c.lineToRelative(-1.14f, -1.0f);
        c.curveTo(21.77f, 17.13f, 21.77f, 16.87f, 21.69f, 16.37f);
        c.close();
        c.moveTo(18.0f, 19.0f);
        c.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        c.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        c.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 19.1f, 19.0f, 18.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roomPreferences = build;
        build.getClass();
        return build;
    }
}
