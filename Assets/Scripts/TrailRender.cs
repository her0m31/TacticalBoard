using UnityEngine;
using System.Collections;

public class TrailRender : MonoBehaviour {

	void Update () {
		// マウス左クリック時
		if (Input.GetMouseButton(0))
		{
			Vector3 screenPosition = new Vector3(Input.mousePosition.x, Input.mousePosition.y, Camera.main.nearClipPlane + 1.0f);

			gameObject.transform.position = Camera.main.ScreenToWorldPoint(screenPosition);
		}
	}
}
