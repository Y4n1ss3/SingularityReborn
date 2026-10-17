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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RouterKt {
    private static ImageVector _router;

    public static final ImageVector getRouter(Icons.Sharp sharp) {
        ImageVector imageVector = _router;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Router", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.2f, 5.9f, 0.8f, -0.8f);
        e.curveTo(19.6f, 3.7f, 17.8f, 3.0f, 16.0f, 3.0f);
        e.reflectiveCurveToRelative(-3.6f, 0.7f, -5.0f, 2.1f);
        e.lineToRelative(0.8f, 0.8f);
        e.curveTo(13.0f, 4.8f, 14.5f, 4.2f, 16.0f, 4.2f);
        e.reflectiveCurveToRelative(3.0f, 0.6f, 4.2f, 1.7f);
        e.close();
        e.moveTo(19.3f, 6.7f);
        e.curveToRelative(-0.9f, -0.9f, -2.1f, -1.4f, -3.3f, -1.4f);
        e.reflectiveCurveToRelative(-2.4f, 0.5f, -3.3f, 1.4f);
        e.lineToRelative(0.8f, 0.8f);
        e.curveToRelative(0.7f, -0.7f, 1.6f, -1.0f, 2.5f, -1.0f);
        e.reflectiveCurveToRelative(1.8f, 0.3f, 2.5f, 1.0f);
        fc.B(e, 0.8f, -0.8f, 21.0f, 13.0f);
        uo.n(e, -4.0f, 17.0f, 9.0f, -2.0f);
        bv.q(e, 4.0f, 3.0f, 13.0f, 8.0f);
        fc.x(e, 18.0f, -8.0f, 8.0f, 18.0f);
        af0.m(e, 6.0f, 18.0f, -2.0f, 2.0f);
        bv.m(e, 2.0f, 11.5f, 18.0f, -2.0f);
        r6.p(e, -2.0f, 2.0f, 2.0f);
        k4.C(e, 15.0f, 18.0f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(e, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _router = build;
        build.getClass();
        return build;
    }
}
