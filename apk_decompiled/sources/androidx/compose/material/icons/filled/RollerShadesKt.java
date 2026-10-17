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
import defpackage.fc;
import defpackage.j50;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RollerShadesKt {
    private static ImageVector _rollerShades;

    public static final ImageVector getRollerShades(Icons.Filled filled) {
        ImageVector imageVector = _rollerShades;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RollerShades", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(20.0f, 19.0f, 3.0f, 4.0f, 16.0f);
        uf.k(f, 2.0f, 2.0f, 20.0f, -2.0f);
        kp0.D(f, 20.0f, 6.0f, 19.0f, -6.0f);
        f.horizontalLineToRelative(5.0f);
        f.verticalLineToRelative(1.8f);
        f.curveToRelative(-0.4f, 0.3f, -0.8f, 0.8f, -0.8f, 1.4f);
        f.curveToRelative(0.0f, 1.0f, 0.8f, 1.8f, 1.8f, 1.8f);
        f.reflectiveCurveToRelative(1.8f, -0.8f, 1.8f, -1.8f);
        f.curveToRelative(0.0f, -0.6f, -0.3f, -1.1f, -0.8f, -1.4f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.p(f, 13.0f, 5.0f, 6.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rollerShades = build;
        build.getClass();
        return build;
    }
}
