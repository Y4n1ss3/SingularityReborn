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
import defpackage.c21;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SystemSecurityUpdateGoodKt {
    private static ImageVector _systemSecurityUpdateGood;

    public static final ImageVector getSystemSecurityUpdateGood(Icons.Sharp sharp) {
        ImageVector imageVector = _systemSecurityUpdateGood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SystemSecurityUpdateGood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(5.0f, 1.0f, 22.0f, 14.0f, 1.0f);
        kp0.B(w, 5.0f, 17.0f, 18.0f, 7.0f);
        c21.c(w, 6.0f, 10.0f, 18.0f);
        w.moveTo(16.0f, 10.05f);
        w.lineToRelative(-1.41f, -1.41f);
        w.lineToRelative(-3.54f, 3.54f);
        w.lineToRelative(-1.41f, -1.41f);
        w.lineToRelative(-1.41f, 1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(w, 11.05f, 15.0f, 16.0f, 10.05f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _systemSecurityUpdateGood = build;
        build.getClass();
        return build;
    }
}
