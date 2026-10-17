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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlareKt {
    private static ImageVector _flare;

    public static final ImageVector getFlare(Icons.Outlined outlined) {
        ImageVector imageVector = _flare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Flare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(7.0f, 11.0f, 1.0f, 11.0f, 2.0f);
        fc.x(s, 6.0f, -2.0f, 9.17f, 7.76f);
        s.lineTo(7.05f, 5.64f);
        s.lineTo(5.64f, 7.05f);
        fc.C(s, 2.12f, 2.12f, 1.41f, -1.41f);
        k4.C(s, 13.0f, 1.0f, -2.0f, 6.0f);
        gy.n(s, 2.0f, 13.0f, 1.0f);
        s.moveTo(18.36f, 7.05f);
        s.lineToRelative(-1.41f, -1.41f);
        s.lineToRelative(-2.12f, 2.12f);
        fc.C(s, 1.41f, 1.41f, 2.12f, -2.12f);
        bv.y(s, 17.0f, 11.0f, 2.0f, 6.0f);
        kf0.C(s, -2.0f, -6.0f, 12.0f, 9.0f);
        s.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        s.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        s.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        s.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        k4.x(s, 14.83f, 16.24f, 2.12f, 2.12f);
        s.lineToRelative(1.41f, -1.41f);
        fc.C(s, -2.12f, -2.12f, -1.41f, 1.41f);
        s.moveTo(5.64f, 16.95f);
        s.lineToRelative(1.41f, 1.41f);
        s.lineToRelative(2.12f, -2.12f);
        fc.C(s, -1.41f, -1.41f, -2.12f, 2.12f);
        k4.C(s, 11.0f, 23.0f, 2.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(s, -2.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flare = build;
        build.getClass();
        return build;
    }
}
