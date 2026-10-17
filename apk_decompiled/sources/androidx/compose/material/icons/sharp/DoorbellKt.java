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
import defpackage.j50;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoorbellKt {
    private static ImageVector _doorbell;

    public static final ImageVector getDoorbell(Icons.Sharp sharp) {
        ImageVector imageVector = _doorbell;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Doorbell", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 3.0f, 4.0f, 9.0f, 12.0f);
        uf.w(s, 16.0f, 9.0f, 12.0f, 3.0f);
        s.moveTo(12.0f, 17.5f);
        s.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        s.horizontalLineToRelative(2.0f);
        s.curveTo(13.0f, 17.05f, 12.55f, 17.5f, 12.0f, 17.5f);
        uo.q(s, 16.0f, 16.0f, 8.0f, -1.0f);
        s.horizontalLineToRelative(1.0f);
        s.verticalLineToRelative(-2.34f);
        s.curveToRelative(0.0f, -1.54f, 0.82f, -2.82f, 2.25f, -3.16f);
        kf0.z(s, -1.0f, 1.5f, 1.0f);
        s.curveTo(14.19f, 9.84f, 15.0f, 11.12f, 15.0f, 12.66f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(s, 15.0f, 1.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doorbell = build;
        build.getClass();
        return build;
    }
}
