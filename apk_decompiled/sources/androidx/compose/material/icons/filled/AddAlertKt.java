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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddAlertKt {
    private static ImageVector _addAlert;

    public static final ImageVector getAddAlert(Icons.Filled filled) {
        ImageVector imageVector = _addAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.01f, 21.01f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f);
        b.reflectiveCurveToRelative(1.99f, -0.89f, 1.99f, -1.99f);
        j50.t(b, -3.98f, 18.88f, 16.82f);
        b.lineTo(18.88f, 11.0f);
        b.curveToRelative(0.0f, -3.25f, -2.25f, -5.97f, -5.29f, -6.69f);
        b.verticalLineToRelative(-0.72f);
        b.curveTo(13.59f, 2.71f, 12.88f, 2.0f, 12.0f, 2.0f);
        b.reflectiveCurveToRelative(-1.59f, 0.71f, -1.59f, 1.59f);
        b.verticalLineToRelative(0.72f);
        b.curveTo(7.37f, 5.03f, 5.12f, 7.75f, 5.12f, 11.0f);
        b.verticalLineToRelative(5.82f);
        b.lineTo(3.0f, 18.94f);
        fc.w(b, 3.0f, 20.0f, 18.0f, -1.06f);
        fc.B(b, -2.12f, -2.12f, 16.0f, 13.01f);
        af0.v(b, -3.0f, 3.0f, -2.0f, -3.0f);
        b.lineTo(8.0f, 13.01f);
        b.lineTo(8.0f, 11.0f);
        uo.n(b, 3.0f, 11.0f, 8.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(b, 3.0f, 3.0f, 2.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAlert = build;
        build.getClass();
        return build;
    }
}
