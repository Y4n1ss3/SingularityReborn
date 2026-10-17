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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CancelPresentationKt {
    private static ImageVector _cancelPresentation;

    public static final ImageVector getCancelPresentation(Icons.Sharp sharp) {
        ImageVector imageVector = _cancelPresentation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CancelPresentation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(1.0f, 3.0f, 18.0f, 22.0f);
        r6.C(m, 23.0f, 3.0f, 1.0f, 3.0f);
        m.moveTo(21.0f, 19.0f);
        m.lineTo(3.0f, 19.0f);
        r6.m(m, 3.0f, 5.0f, 18.0f, 14.0f);
        m.moveTo(9.41f, 16.0f);
        m.lineTo(12.0f, 13.41f);
        m.lineTo(14.59f, 16.0f);
        m.lineTo(16.0f, 14.59f);
        m.lineTo(13.41f, 12.0f);
        m.lineTo(16.0f, 9.41f);
        m.lineTo(14.59f, 8.0f);
        m.lineTo(12.0f, 10.59f);
        m.lineTo(9.41f, 8.0f);
        m.lineTo(8.0f, 9.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(m, 10.59f, 12.0f, 8.0f, 14.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cancelPresentation = build;
        build.getClass();
        return build;
    }
}
