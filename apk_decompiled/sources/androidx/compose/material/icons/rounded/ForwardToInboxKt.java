package androidx.compose.material.icons.rounded;

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
import defpackage.er;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ForwardToInboxKt {
    private static ImageVector _forwardToInbox;

    public static final ImageVector getForwardToInbox(Icons.Rounded rounded) {
        ImageVector imageVector = _forwardToInbox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ForwardToInbox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.o(d, 9.0f, -2.0f, 4.0f, 8.0f);
        d.lineToRelative(6.94f, 4.34f);
        d.curveToRelative(0.65f, 0.41f, 1.47f, 0.41f, 2.12f, 0.0f);
        af0.m(d, 20.0f, 8.0f, 5.0f, 2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        k4.r(d, 12.0f, 11.0f, 4.0f, 6.0f);
        gy.n(d, 16.0f, 12.0f, 11.0f);
        d.moveTo(19.0f, 16.21f);
        d.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        d.lineToRelative(2.79f, 2.79f);
        d.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        d.lineToRelative(-2.79f, 2.79f);
        d.curveTo(19.54f, 22.46f, 19.0f, 22.24f, 19.0f, 21.79f);
        d.verticalLineTo(20.0f);
        d.horizontalLineToRelative(-3.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 3.0f, 16.21f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forwardToInbox = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getForwardToInbox$annotations(Icons.Rounded rounded) {
    }
}
