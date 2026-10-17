package androidx.compose.material.icons.outlined;

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
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoomServiceKt {
    private static ImageVector _roomService;

    public static final ImageVector getRoomService(Icons.Outlined outlined) {
        ImageVector imageVector = _roomService;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RoomService", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(18.98f, 17.0f, 2.0f, 17.0f, 2.0f);
        fc.x(s, 20.0f, -2.0f, 21.0f, 16.0f);
        s.curveToRelative(-0.27f, -4.07f, -3.25f, -7.4f, -7.16f, -8.21f);
        s.curveToRelative(0.1f, -0.24f, 0.16f, -0.51f, 0.16f, -0.79f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        s.curveToRelative(0.0f, 0.28f, 0.06f, 0.55f, 0.16f, 0.79f);
        s.curveTo(6.25f, 8.6f, 3.27f, 11.93f, 3.0f, 16.0f);
        j50.t(s, 18.0f, 12.0f, 9.58f);
        s.curveToRelative(2.95f, 0.0f, 5.47f, 1.83f, 6.5f, 4.41f);
        s.horizontalLineToRelative(-13.0f);
        s.curveToRelative(1.03f, -2.58f, 3.55f, -4.41f, 6.5f, -4.41f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roomService = build;
        build.getClass();
        return build;
    }
}
