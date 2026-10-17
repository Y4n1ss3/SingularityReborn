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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddAlertKt {
    private static ImageVector _addAlert;

    public static final ImageVector getAddAlert(Icons.Sharp sharp) {
        ImageVector imageVector = _addAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AddAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 23.0f);
        b.curveToRelative(1.1f, 0.0f, 1.99f, -0.89f, 1.99f, -1.99f);
        b.horizontalLineToRelative(-3.98f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f);
        bv.v(b, 19.0f, 17.0f, -6.0f);
        b.curveToRelative(0.0f, -3.35f, -2.36f, -6.15f, -5.5f, -6.83f);
        fc.w(b, 13.5f, 1.5f, -3.0f, 2.67f);
        b.curveTo(7.36f, 4.85f, 5.0f, 7.65f, 5.0f, 11.0f);
        j50.A(b, 6.0f, -2.0f, 2.0f, 1.0f);
        j50.u(b, 18.0f, -1.0f, -2.0f, -2.0f);
        k4.C(b, 16.0f, 13.01f, -3.0f, 3.0f);
        bv.C(b, -2.0f, -3.0f, 8.0f, 13.01f);
        b.lineTo(8.0f, 11.0f);
        uo.n(b, 3.0f, 11.0f, 8.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(b, 3.0f, 3.0f, 2.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAlert = build;
        build.getClass();
        return build;
    }
}
