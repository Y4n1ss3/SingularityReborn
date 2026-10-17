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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeviceUnknownKt {
    private static ImageVector _deviceUnknown;

    public static final ImageVector getDeviceUnknown(Icons.TwoTone twoTone) {
        ImageVector imageVector = _deviceUnknown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DeviceUnknown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(7.0f, 19.0f, 10.0f, 17.0f, 5.0f);
        bv.r(p, 7.0f, 5.0f, 14.0f);
        k4.C(p, 13.0f, 18.0f, -2.0f, -2.0f);
        fc.x(p, 2.0f, 2.0f, 12.0f, 6.72f);
        p.curveToRelative(1.96f, 0.0f, 3.5f, 1.51f, 3.5f, 3.47f);
        p.curveToRelative(0.0f, 2.26f, -2.62f, 2.49f, -2.62f, 4.45f);
        p.horizontalLineToRelative(-1.76f);
        p.curveToRelative(0.0f, -2.88f, 2.63f, -2.7f, 2.63f, -4.45f);
        p.curveToRelative(0.0f, -0.93f, -0.82f, -1.75f, -1.75f, -1.75f);
        p.reflectiveCurveToRelative(-1.75f, 0.82f, -1.75f, 1.75f);
        p.lineTo(8.5f, 10.19f);
        p.curveToRelative(0.0f, -1.95f, 1.54f, -3.47f, 3.5f, -3.47f);
        p.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(11.0f, 16.0f, 2.0f, 2.0f, -2.0f);
        q.moveTo(17.0f, 1.0f);
        q.lineTo(7.0f, 1.0f);
        q.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q.verticalLineToRelative(18.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q.horizontalLineToRelative(10.0f);
        q.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q.lineTo(19.0f, 3.0f);
        q.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(q, 17.0f, 19.0f, 7.0f, 19.0f);
        r6.m(q, 7.0f, 5.0f, 10.0f, 14.0f);
        q.moveTo(12.0f, 8.44f);
        q.curveToRelative(0.93f, 0.0f, 1.75f, 0.82f, 1.75f, 1.75f);
        q.curveToRelative(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f);
        q.horizontalLineToRelative(1.76f);
        q.curveToRelative(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f);
        q.curveToRelative(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f);
        q.reflectiveCurveToRelative(-3.5f, 1.52f, -3.5f, 3.47f);
        q.horizontalLineToRelative(1.75f);
        q.curveToRelative(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f);
        q.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deviceUnknown = build;
        build.getClass();
        return build;
    }
}
