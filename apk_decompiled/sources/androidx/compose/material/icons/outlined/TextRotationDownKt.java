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
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotationDownKt {
    private static ImageVector _textRotationDown;

    public static final ImageVector getTextRotationDown(Icons.Outlined outlined) {
        ImageVector imageVector = _textRotationDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TextRotationDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(6.0f, 20.0f, 3.0f, -3.0f);
        e.lineTo(7.0f, 17.0f);
        e.lineTo(7.0f, 4.0f);
        e.lineTo(5.0f, 4.0f);
        e.verticalLineToRelative(13.0f);
        bv.o(e, 3.0f, 17.0f, 3.0f, 3.0f);
        e.moveTo(12.2f, 8.5f);
        j50.A(e, 5.0f, -2.2f, 0.9f, 2.1f);
        e.lineToRelative(11.0f, -4.75f);
        bv.q(e, -1.5f, 10.0f, 5.5f, 2.1f);
        fc.B(e, 2.2f, 0.9f, 19.02f, 11.0f);
        e.lineTo(14.0f, 12.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 14.0f, 9.13f, 19.02f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationDown = build;
        build.getClass();
        return build;
    }
}
