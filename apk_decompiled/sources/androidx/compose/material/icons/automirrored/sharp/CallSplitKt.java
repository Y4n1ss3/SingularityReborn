package androidx.compose.material.icons.automirrored.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CallSplitKt {
    private static ImageVector _callSplit;

    public static final ImageVector getCallSplit(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _callSplit;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.CallSplit", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.0f, 4.0f, 2.29f, 2.29f);
        e.lineToRelative(-2.88f, 2.88f);
        e.lineToRelative(1.42f, 1.42f);
        e.lineToRelative(2.88f, -2.88f);
        e.lineTo(20.0f, 10.0f);
        uf.j(e, 20.0f, 4.0f, -6.0f);
        e.moveTo(10.0f, 4.0f);
        e.lineTo(4.0f, 4.0f);
        e.verticalLineToRelative(6.0f);
        e.lineToRelative(2.29f, -2.29f);
        e.lineToRelative(4.71f, 4.7f);
        fc.w(e, 11.0f, 20.0f, 2.0f, -8.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, -5.29f, -5.3f, 10.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _callSplit = build;
        build.getClass();
        return build;
    }
}
