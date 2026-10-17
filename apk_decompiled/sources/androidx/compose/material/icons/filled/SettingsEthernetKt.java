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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsEthernetKt {
    private static ImageVector _settingsEthernet;

    public static final ImageVector getSettingsEthernet(Icons.Filled filled) {
        ImageVector imageVector = _settingsEthernet;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsEthernet", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.77f, 6.76f, 6.23f, 5.48f);
        i.lineTo(0.82f, 12.0f);
        i.lineToRelative(5.41f, 6.52f);
        i.lineToRelative(1.54f, -1.28f);
        bv.o(i, 3.42f, 12.0f, 4.35f, -5.24f);
        k4.C(i, 7.0f, 13.0f, 2.0f, -2.0f);
        bv.r(i, 7.0f, 11.0f, 2.0f);
        k4.C(i, 17.0f, 11.0f, -2.0f, 2.0f);
        fc.x(i, 2.0f, -2.0f, 11.0f, 13.0f);
        gy.D(i, 2.0f, -2.0f, -2.0f, 2.0f);
        i.moveTo(17.77f, 5.48f);
        i.lineToRelative(-1.54f, 1.28f);
        i.lineTo(20.58f, 12.0f);
        i.lineToRelative(-4.35f, 5.24f);
        i.lineToRelative(1.54f, 1.28f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 23.18f, 12.0f, -5.41f, -6.52f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsEthernet = build;
        build.getClass();
        return build;
    }
}
