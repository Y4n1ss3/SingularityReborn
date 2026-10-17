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
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotationDownKt {
    private static ImageVector _textRotationDown;

    public static final ImageVector getTextRotationDown(Icons.Filled filled) {
        ImageVector imageVector = _textRotationDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TextRotationDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(21.0f, 12.0f, -1.5f, 10.0f, 5.75f);
        j50.A(y, 2.1f, 2.2f, 0.9f, 5.0f);
        y.lineToRelative(-2.2f, 0.9f);
        kf0.t(y, 2.1f, 21.0f, 12.0f);
        y.moveTo(14.0f, 9.38f);
        y.lineToRelative(5.02f, 1.87f);
        r6.C(y, 14.0f, 13.12f, 14.0f, 9.38f);
        y.moveTo(6.0f, 19.75f);
        y.lineToRelative(3.0f, -3.0f);
        y.lineTo(7.0f, 16.75f);
        y.lineTo(7.0f, 4.25f);
        y.lineTo(5.0f, 4.25f);
        y.verticalLineToRelative(12.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(y, 3.0f, 16.75f, 3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationDown = build;
        build.getClass();
        return build;
    }
}
