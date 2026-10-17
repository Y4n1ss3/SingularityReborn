package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {
    private Paint paint;
    private Object token;

    public RectListDebuggerModifierNode() {
        androidx.compose.ui.graphics.Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4637setColor8_81llA(Color.Companion.m4795getRed0d7_KjU());
        Paint.mo4641setStylek9PVt8s(PaintingStyle.Companion.m5043getStrokeTiuSbCo());
        this.paint = AndroidPaint_androidKt.getNativePaint(Paint);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        RectList rects = DelegatableNodeKt.requireOwner(this).getRectManager().getRects();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        Paint paint = this.paint;
        long[] jArr = rects.items;
        int i = rects.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            nativeCanvas.drawRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2, paint);
        }
    }

    public final Object getToken() {
        return this.token;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.token = DelegatableNodeKt.requireOwner(this).getRectManager().registerOnChangedCallback(new RectListDebuggerModifierNode$onAttach$1(this));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNodeKt.requireOwner(this).getRectManager().unregisterOnChangedCallback(this.token);
    }

    public final void setToken(Object obj) {
        this.token = obj;
    }
}
