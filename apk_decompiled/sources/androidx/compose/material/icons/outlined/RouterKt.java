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
import defpackage.af0;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RouterKt {
    private static ImageVector _router;

    public static final ImageVector getRouter(Icons.Outlined outlined) {
        ImageVector imageVector = _router;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Router", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 4.2f);
        b.curveToRelative(1.5f, 0.0f, 3.0f, 0.6f, 4.2f, 1.7f);
        b.lineToRelative(0.8f, -0.8f);
        b.curveTo(19.6f, 3.7f, 17.8f, 3.0f, 16.0f, 3.0f);
        b.reflectiveCurveToRelative(-3.6f, 0.7f, -5.0f, 2.1f);
        b.lineToRelative(0.8f, 0.8f);
        b.curveTo(13.0f, 4.8f, 14.5f, 4.2f, 16.0f, 4.2f);
        k4.x(b, 12.7f, 6.7f, 0.8f, 0.8f);
        b.curveToRelative(0.7f, -0.7f, 1.6f, -1.0f, 2.5f, -1.0f);
        b.reflectiveCurveToRelative(1.8f, 0.3f, 2.5f, 1.0f);
        b.lineToRelative(0.8f, -0.8f);
        b.curveToRelative(-0.9f, -0.9f, -2.1f, -1.4f, -3.3f, -1.4f);
        b.reflectiveCurveToRelative(-2.4f, 0.5f, -3.3f, 1.4f);
        af0.l(b, 19.0f, 13.0f, -2.0f);
        fc.w(b, 17.0f, 9.0f, -2.0f, 4.0f);
        b.lineTo(5.0f, 13.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(14.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(b, 19.0f, 19.0f, 5.0f, 19.0f);
        r6.p(b, -4.0f, 14.0f, 4.0f);
        k4.C(b, 6.0f, 16.0f, 2.0f, 2.0f);
        uo.l(b, 6.0f, 18.0f, 9.5f, 16.0f);
        j50.n(b, 2.0f, 2.0f, -2.0f);
        k4.C(b, 13.0f, 16.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(b, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _router = build;
        build.getClass();
        return build;
    }
}
