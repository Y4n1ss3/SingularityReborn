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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrowserUpdatedKt {
    private static ImageVector _browserUpdated;

    public static final ImageVector getBrowserUpdated(Icons.Outlined outlined) {
        ImageVector imageVector = _browserUpdated;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BrowserUpdated", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(22.0f, 13.0f, 3.0f);
        h.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        fc.D(h, -3.0f, 1.0f, 1.0f, 2.0f);
        k4.q(h, 6.0f, -2.0f, 1.0f, -1.0f);
        h.horizontalLineTo(4.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        h.verticalLineTo(5.0f);
        h.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        h.lineToRelative(8.0f, 0.0f);
        bv.q(h, 2.0f, 4.0f, 5.0f, 11.0f);
        kp0.j(h, 16.0f, -3.0f, 22.0f);
        h.moveTo(15.0f, 15.0f);
        h.lineToRelative(-5.0f, -5.0f);
        h.lineToRelative(1.41f, -1.41f);
        fc.t(h, 14.0f, 11.17f, 3.0f, 2.0f);
        h.verticalLineToRelative(8.17f);
        h.lineToRelative(2.59f, -2.58f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(h, 20.0f, 10.0f, 15.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _browserUpdated = build;
        build.getClass();
        return build;
    }
}
