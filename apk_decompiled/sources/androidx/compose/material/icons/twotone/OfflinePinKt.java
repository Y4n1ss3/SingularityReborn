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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OfflinePinKt {
    private static ImageVector _offlinePin;

    public static final ImageVector getOfflinePin(Icons.TwoTone twoTone) {
        ImageVector imageVector = _offlinePin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.OfflinePin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        k4.r(b, 17.0f, 17.0f, 7.0f, 17.0f);
        r6.p(b, -2.0f, 10.0f, 2.0f);
        b.moveTo(10.3f, 14.0f);
        b.lineTo(7.0f, 10.7f);
        b.lineToRelative(1.4f, -1.4f);
        b.lineToRelative(1.9f, 1.9f);
        b.lineToRelative(5.3f, -5.3f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 17.0f, 7.3f, 10.3f, 14.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b2.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b2.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b2.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        r6.B(b2, 7.0f, 15.0f, 10.0f, 2.0f);
        uo.l(b2, 7.0f, 17.0f, 10.3f, 11.2f);
        b2.lineTo(8.4f, 9.3f);
        b2.lineTo(7.0f, 10.7f);
        b2.lineToRelative(3.3f, 3.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(b2, 17.0f, 7.3f, -1.4f, -1.4f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlinePin = build;
        build.getClass();
        return build;
    }
}
