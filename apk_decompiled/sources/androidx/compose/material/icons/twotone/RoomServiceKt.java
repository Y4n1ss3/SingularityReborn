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
import defpackage.bv;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoomServiceKt {
    private static ImageVector _roomService;

    public static final ImageVector getRoomService(Icons.TwoTone twoTone) {
        ImageVector imageVector = _roomService;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RoomService", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 9.58f);
        b.curveToRelative(-2.95f, 0.0f, -5.47f, 1.83f, -6.5f, 4.41f);
        b.horizontalLineToRelative(13.0f);
        b.curveToRelative(-1.03f, -2.58f, -3.55f, -4.41f, -6.5f, -4.41f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = bv.b(2.0f, 17.0f, 20.0f, 2.0f);
        uo.l(b2, 2.0f, 19.0f, 13.84f, 7.79f);
        b2.curveToRelative(0.1f, -0.24f, 0.16f, -0.51f, 0.16f, -0.79f);
        b2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b2.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b2.curveToRelative(0.0f, 0.28f, 0.06f, 0.55f, 0.16f, 0.79f);
        b2.curveTo(6.25f, 8.6f, 3.27f, 11.93f, 3.0f, 16.0f);
        b2.horizontalLineToRelative(18.0f);
        b2.curveToRelative(-0.27f, -4.07f, -3.25f, -7.4f, -7.16f, -8.21f);
        b2.close();
        b2.moveTo(12.0f, 9.58f);
        b2.curveToRelative(2.95f, 0.0f, 5.47f, 1.83f, 6.5f, 4.41f);
        b2.horizontalLineToRelative(-13.0f);
        b2.curveToRelative(1.03f, -2.58f, 3.55f, -4.41f, 6.5f, -4.41f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roomService = build;
        build.getClass();
        return build;
    }
}
