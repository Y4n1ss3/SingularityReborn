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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DesktopAccessDisabledKt {
    private static ImageVector _desktopAccessDisabled;

    public static final ImageVector getDesktopAccessDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _desktopAccessDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DesktopAccessDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(1.41f, 1.69f, 0.0f, 3.1f);
        i.lineToRelative(1.0f, 0.99f);
        i.verticalLineTo(16.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        af0.o(i, 10.0f, 2.0f, 8.0f, 2.0f);
        af0.v(i, 8.0f, -2.0f, -2.0f, -2.0f);
        i.horizontalLineToRelative(0.9f);
        i.lineToRelative(6.0f, 6.0f);
        fc.C(i, 1.41f, -1.41f, -20.9f, -20.9f);
        i.moveTo(2.99f, 16.0f);
        i.verticalLineTo(6.09f);
        i.lineTo(12.9f, 16.0f);
        i.horizontalLineTo(2.99f);
        i.close();
        i.moveTo(4.55f, 2.0f);
        j50.x(i, 2.0f, 2.0f, 21.0f, 12.0f);
        kf0.B(i, -2.45f, 2.0f, 2.0f, 0.44f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 4.55f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _desktopAccessDisabled = build;
        build.getClass();
        return build;
    }
}
