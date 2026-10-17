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
import defpackage.fc;
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DesktopAccessDisabledKt {
    private static ImageVector _desktopAccessDisabled;

    public static final ImageVector getDesktopAccessDisabled(Icons.Sharp sharp) {
        ImageVector imageVector = _desktopAccessDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DesktopAccessDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(1.41f, 1.69f, 0.0f, 3.1f);
        fc.u(i, 1.0f, 0.99f, 18.0f, 9.0f);
        af0.B(i, 2.0f, 8.0f, 2.0f, 8.0f);
        r6.D(i, -2.0f, -2.0f, -2.0f, 0.9f);
        i.lineToRelative(6.0f, 6.0f);
        fc.C(i, 1.41f, -1.41f, -20.9f, -20.9f);
        i.moveTo(2.99f, 16.0f);
        i.verticalLineTo(6.09f);
        i.lineTo(12.9f, 16.0f);
        i.horizontalLineTo(2.99f);
        i.close();
        i.moveTo(4.55f, 2.0f);
        j50.x(i, 2.0f, 2.0f, 21.0f, 12.0f);
        kf0.B(i, -2.45f, 2.0f, 2.0f, 2.44f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _desktopAccessDisabled = build;
        build.getClass();
        return build;
    }
}
