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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PushPinKt {
    private static ImageVector _pushPin;

    public static final ImageVector getPushPin(Icons.TwoTone twoTone) {
        ImageVector imageVector = _pushPin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PushPin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(14.0f, 4.0f, -4.0f, 5.0f);
        b.curveToRelative(0.0f, 1.1f, -0.35f, 2.14f, -1.0f, 3.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(-0.63f, -0.84f, -1.0f, -1.88f, -1.0f, -3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(19.0f, 12.0f);
        b2.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b2.verticalLineTo(4.0f);
        b2.lineToRelative(1.0f, 0.0f);
        b2.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b2.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b2.horizontalLineTo(7.0f);
        b2.curveTo(6.45f, 2.0f, 6.0f, 2.45f, 6.0f, 3.0f);
        b2.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b2.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b2.lineToRelative(1.0f, 0.0f);
        b2.verticalLineToRelative(5.0f);
        b2.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        kf0.z(b2, 2.0f, 5.97f, 7.0f);
        b2.lineToRelative(1.0f, 1.0f);
        gy.j(b2, 1.0f, -1.0f, -7.0f, 19.0f);
        b2.lineTo(19.0f, 12.0f);
        b2.curveTo(19.0f, 12.0f, 19.0f, 12.0f, 19.0f, 12.0f);
        b2.close();
        b2.moveTo(9.0f, 12.0f);
        b2.curveToRelative(0.65f, -0.86f, 1.0f, -1.9f, 1.0f, -3.0f);
        kf0.r(b2, 4.0f, 4.0f, 5.0f);
        b2.curveToRelative(0.0f, 1.12f, 0.37f, 2.16f, 1.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b2, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pushPin = build;
        build.getClass();
        return build;
    }
}
