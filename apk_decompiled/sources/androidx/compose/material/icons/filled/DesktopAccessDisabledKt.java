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
import defpackage.bv;
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DesktopAccessDisabledKt {
    private static ImageVector _desktopAccessDisabled;

    public static final ImageVector getDesktopAccessDisabled(Icons.Filled filled) {
        ImageVector imageVector = _desktopAccessDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DesktopAccessDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.0f, 16.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        kf0.B(b, -1.0f, -2.0f, -2.0f, 3.0f);
        b.lineTo(21.0f, 4.0f);
        b.lineTo(6.0f, 4.0f);
        b.lineTo(4.0f, 2.0f);
        b.horizontalLineToRelative(17.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        r6.l(b, 12.0f, 17.5f, 18.0f);
        fc.B(b, -2.0f, -2.0f, 14.9f, 18.0f);
        b.lineToRelative(6.0f, 6.0f);
        b.lineToRelative(1.3f, -1.3f);
        b.lineToRelative(-4.7f, -4.7f);
        b.lineToRelative(-2.0f, -2.0f);
        b.lineTo(1.2f, 1.8f);
        b.lineTo(0.0f, 3.1f);
        b.lineToRelative(1.0f, 1.0f);
        b.lineTo(1.0f, 16.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(b, 7.0f, 2.0f, 8.0f, 20.0f);
        r6.D(b, 2.0f, 8.0f, -2.0f, -2.0f);
        kf0.C(b, -2.0f, 0.9f, 3.0f, 16.0f);
        b.lineTo(3.0f, 6.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 9.9f, 9.9f, 3.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _desktopAccessDisabled = build;
        build.getClass();
        return build;
    }
}
