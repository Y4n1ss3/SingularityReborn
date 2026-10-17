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
import defpackage.er;
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.Sharp sharp) {
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhoneMissed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.32f, 16.67f);
        b.curveToRelative(-2.95f, -2.79f, -6.93f, -4.51f, -11.31f, -4.51f);
        b.curveToRelative(-4.39f, 0.0f, -8.37f, 1.72f, -11.31f, 4.51f);
        b.lineToRelative(-0.69f, 0.69f);
        b.lineTo(3.65f, 21.0f);
        b.lineToRelative(3.93f, -2.72f);
        b.lineToRelative(-0.01f, -3.49f);
        b.curveToRelative(1.4f, -0.45f, 2.9f, -0.7f, 4.44f, -0.7f);
        b.curveToRelative(1.55f, 0.0f, 3.04f, 0.24f, 4.44f, 0.7f);
        b.lineToRelative(-0.01f, 3.49f);
        b.lineTo(20.37f, 21.0f);
        b.lineToRelative(3.64f, -3.64f);
        b.curveToRelative(0.0f, -0.01f, -0.52f, -0.52f, -0.69f, -0.69f);
        k4.x(b, 7.0f, 6.43f, 4.94f, 4.94f);
        b.lineToRelative(7.07f, -7.07f);
        b.lineToRelative(-1.41f, -1.42f);
        b.lineToRelative(-5.66f, 5.66f);
        fc.v(b, 8.4f, 5.0f, 11.0f, 3.0f);
        b.horizontalLineTo(5.0f);
        b.verticalLineToRelative(6.0f);
        b.horizontalLineToRelative(2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getPhoneMissed$annotations(Icons.Sharp sharp) {
    }
}
