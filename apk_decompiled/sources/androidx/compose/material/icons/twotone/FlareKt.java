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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlareKt {
    private static ImageVector _flare;

    public static final ImageVector getFlare(Icons.TwoTone twoTone) {
        ImageVector imageVector = _flare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Flare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(5.644f, 7.05f, 7.05f, 5.645f);
        fc.C(i, 2.123f, 2.122f, -1.408f, 1.407f);
        k4.C(i, 11.0f, 1.0f, 2.0f, 6.0f);
        j50.t(i, -2.0f, 16.242f, 14.834f);
        i.lineToRelative(2.12f, 2.12f);
        fc.C(i, -1.406f, 1.408f, -2.12f, -2.12f);
        i.moveTo(14.834f, 7.76f);
        i.lineToRelative(2.12f, -2.123f);
        fc.C(i, 1.41f, 1.407f, -2.123f, 2.122f);
        i.moveTo(9.166f, 16.242f);
        i.lineToRelative(-2.122f, 2.12f);
        fc.C(i, -1.407f, -1.406f, 2.122f, -2.122f);
        i.moveTo(12.0f, 9.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        i.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        i.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        r6.B(i, 11.0f, 17.0f, 2.0f, 6.0f);
        kp0.A(i, -2.0f, 1.0f, 11.0f, 6.0f);
        kf0.t(i, 2.0f, 1.0f, 13.0f);
        k4.C(i, 17.0f, 11.0f, 6.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(i, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flare = build;
        build.getClass();
        return build;
    }
}
