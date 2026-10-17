package androidx.compose.material.icons.filled;

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
import defpackage.j50;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlindsClosedKt {
    private static ImageVector _blindsClosed;

    public static final ImageVector getBlindsClosed(Icons.Filled filled) {
        ImageVector imageVector = _blindsClosed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BlindsClosed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(20.0f, 19.0f, 3.0f, 4.0f, 16.0f);
        af0.u(f, 2.0f, 2.0f, 11.25f);
        f.curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f);
        f.reflectiveCurveToRelative(1.75f, -0.78f, 1.75f, -1.75f);
        fc.j(f, 22.0f, -2.0f, 20.0f);
        j50.y(f, 18.0f, 11.0f, -2.0f, 9.0f);
        uo.r(f, 2.0f, 11.0f, 14.0f, 11.0f);
        uo.o(f, 6.0f, 9.0f, 8.0f, 11.0f);
        uf.D(f, 14.0f, 13.0f, 2.0f, 6.0f);
        kf0.n(f, -2.0f, 14.0f, 16.0f, 13.0f);
        bv.l(f, 2.0f, 2.0f, -2.0f, 13.0f);
        j50.y(f, 18.0f, 7.0f, -2.0f, 5.0f);
        uo.r(f, 2.0f, 7.0f, 14.0f, 5.0f);
        f.verticalLineToRelative(2.0f);
        f.horizontalLineTo(6.0f);
        f.verticalLineTo(5.0f);
        f.horizontalLineTo(14.0f);
        f.close();
        bv.y(f, 6.0f, 19.0f, -2.0f, 8.0f);
        kf0.n(f, 2.0f, 6.0f, 16.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(f, -2.0f, 2.0f, 2.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blindsClosed = build;
        build.getClass();
        return build;
    }
}
