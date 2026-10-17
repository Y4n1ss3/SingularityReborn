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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbSunnyKt {
    private static ImageVector _wbSunny;

    public static final ImageVector getWbSunny(Icons.Sharp sharp) {
        ImageVector imageVector = _wbSunny;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WbSunny", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(6.76f, 4.84f, -1.8f, -1.79f);
        e.lineToRelative(-1.41f, 1.41f);
        fc.C(e, 1.79f, 1.79f, 1.42f, -1.41f);
        e.moveTo(4.0f, 10.5f);
        af0.m(e, 1.0f, 10.5f, 2.0f, 3.0f);
        bv.m(e, -2.0f, 13.0f, 0.55f, -2.0f);
        e.lineTo(11.0f, 3.5f);
        gy.n(e, 2.0f, 13.0f, 0.55f);
        e.moveTo(20.45f, 4.46f);
        e.lineToRelative(-1.41f, -1.41f);
        e.lineToRelative(-1.79f, 1.79f);
        fc.C(e, 1.41f, 1.41f, 1.79f, -1.79f);
        e.moveTo(17.24f, 18.16f);
        e.lineToRelative(1.79f, 1.8f);
        e.lineToRelative(1.41f, -1.41f);
        fc.C(e, -1.8f, -1.79f, -1.4f, 1.4f);
        bv.y(e, 20.0f, 10.5f, 2.0f, 3.0f);
        kf0.C(e, -2.0f, -3.0f, 12.0f, 5.5f);
        e.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        e.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        e.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        e.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        af0.l(e, 11.0f, 22.45f, 2.0f);
        r6.m(e, 13.0f, 19.5f, -2.0f, 2.95f);
        e.moveTo(3.55f, 18.54f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(1.79f, -1.8f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -1.41f, -1.41f, -1.79f, 1.8f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbSunny = build;
        build.getClass();
        return build;
    }
}
