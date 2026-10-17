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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoAwesomeKt {
    private static ImageVector _autoAwesome;

    public static final ImageVector getAutoAwesome(Icons.Sharp sharp) {
        ImageVector imageVector = _autoAwesome;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AutoAwesome", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.0f, 9.0f, 1.25f, -2.75f);
        e.lineTo(23.0f, 5.0f);
        e.lineToRelative(-2.75f, -1.25f);
        e.lineTo(19.0f, 1.0f);
        e.lineToRelative(-1.25f, 2.75f);
        e.lineTo(15.0f, 5.0f);
        gy.B(e, 2.75f, 1.25f, 19.0f, 9.0f);
        e.moveTo(11.5f, 9.5f);
        e.lineTo(9.0f, 4.0f);
        e.lineTo(6.5f, 9.5f);
        e.lineTo(1.0f, 12.0f);
        e.lineToRelative(5.5f, 2.5f);
        e.lineTo(9.0f, 20.0f);
        e.lineToRelative(2.5f, -5.5f);
        r6.C(e, 17.0f, 12.0f, 11.5f, 9.5f);
        e.moveTo(19.0f, 15.0f);
        e.lineToRelative(-1.25f, 2.75f);
        e.lineTo(15.0f, 19.0f);
        e.lineToRelative(2.75f, 1.25f);
        e.lineTo(19.0f, 23.0f);
        e.lineToRelative(1.25f, -2.75f);
        e.lineTo(23.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, -2.75f, -1.25f, 19.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoAwesome = build;
        build.getClass();
        return build;
    }
}
