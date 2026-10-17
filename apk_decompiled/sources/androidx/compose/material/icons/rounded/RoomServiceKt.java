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
public final class RoomServiceKt {
    private static ImageVector _roomService;

    public static final ImageVector getRoomService(Icons.Rounded rounded) {
        ImageVector imageVector = _roomService;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RoomService", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(3.0f, 17.0f, 18.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.lineTo(3.0f, 19.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.close();
        a.moveTo(13.84f, 7.79f);
        a.curveToRelative(0.1f, -0.24f, 0.16f, -0.51f, 0.16f, -0.79f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        a.curveToRelative(0.0f, 0.28f, 0.06f, 0.55f, 0.16f, 0.79f);
        a.curveTo(6.25f, 8.6f, 3.27f, 11.93f, 3.0f, 16.0f);
        a.horizontalLineToRelative(18.0f);
        a.curveToRelative(-0.27f, -4.07f, -3.25f, -7.4f, -7.16f, -8.21f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roomService = build;
        build.getClass();
        return build;
    }
}
